package br.lucas.ex_15_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class ComandoMouseFiguraLista extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	Painel painel;
	
	private JPanel mousePanel;
	
	private JList ListaDesenho;
	
	public ComandoMouseFiguraLista () {
		super("Trabalho de Projeto de Software I (2º Bimestre) - Exercício 15.8");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		mousePanel = new JPanel();
		add(mousePanel, BorderLayout.CENTER);
		
		JLabel status = new JLabel("Mensagens de evento do mouse.");
		add(status, BorderLayout.SOUTH);
		
		mousePanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {
				status.setText(String.format("Mouse foi arrastado no ponto: (%d; %d)", event.getX(), event.getY()));
			}

			@Override
			public void mouseMoved(MouseEvent event) {
				status.setText(String.format("Mouse foi movimentado no ponto: (%d; %d)", event.getX(), event.getY()));
			}
			
		});
		
		mousePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent event) {
				String detalhe;
				if (event.isMetaDown())
					detalhe = " com botão direito";
				else if (event.isAltDown())
					detalhe = " com botão do meio";
				else
					detalhe = " com botão direito";
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
				status.setText(String.format("Botão do mouse foi pressionado no ponto: (%d; %d)"));
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				status.setText(String.format("Botão do mouse foi liberado no ponto: (%d; %d)", event.getX(), event.getY()));
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComandoMouseFiguraLista();
	}
}

class Painel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}

class ListaDesenho extends JList {
	private static final long serialVersionUID = 1L;
	
}
