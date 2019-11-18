package br.lucas.ex_15_6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class DesenhoFiguras extends JFrame {
	private static final long serialVersionUID = 1L;
	
	Painel painel;
	
	private JPanel mousePanel;
	
	private JToolBar barraFerramenta;
	
	public DesenhoFiguras() {
		super("Trabalho de Projeto de Software I (2º Bimestre) - Exercício 15.6");
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		mousePanel = new JPanel();
		add(mousePanel, BorderLayout.CENTER);
		
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.SOUTH);
		
		barraFerramenta = new JToolBar();
		add(barraFerramenta, BorderLayout.NORTH);
		
		
		
		mousePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent event) {
				String detalhe;
				if (event.isMetaDown())
					detalhe = " com botão direito";
				else if (event.isAltDown())
					detalhe = " com botão do meio";
				else
					detalhe = " com botão esquerdo";
				status.setText(String.format("Mouse foi \"clicado\" no ponto: (%d; %d) %s", event.getX(), event.getY(), detalhe));
			}

			@Override
			public void mouseEntered(MouseEvent event) {
				
			}

			@Override
			public void mouseExited(MouseEvent event) {
				
			}

			@Override
			public void mousePressed(MouseEvent event) {
				status.setText(String.format("Botão do mouse foi pressionado no ponto: (%d; %d)", event.getX(), event.getY()));
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				status.setText(String.format("Botão do mouse foi liberado no ponto: (%d; %d)", event.getX(), event.getY()));
			}
			
		});
		
		mousePanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {
				status.setText(String.format("Mouse foi arrastado no ponto: (%d; %d)", event.getX(), event.getY()));
			}

			@Override
			public void mouseMoved(MouseEvent event) {
				status.setText(String.format("Mouse foi movido no ponto: (%d; %d)", event.getX(), event.getY()));
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new DesenhoFiguras();
	}
}

class Painel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		
	}
}

private class EventoDesenho implements ActionListener {
	int forma = 0;
}
