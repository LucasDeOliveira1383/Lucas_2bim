package br.lucas.ex_15_5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class DesenhoCirculos extends JFrame {
	private static final long serialVersionUID = 1L;
	
	Painel painel;
	
	private JPanel mousePanel;
	
	private JToolBar barraFerramenta;
	
	private JButton Circulo = new JButton("Circulo");
	
	EventoDesenho desenho;
	
	private Color CorFigura = Color.RED;
	private Color UltimaCor = Color.RED;
	
	public DesenhoCirculos() {
		super("Trabalho de Projeto de Software I (2º Bimestre) - Exercício 15.5");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		mousePanel = new JPanel();
		add(mousePanel, BorderLayout.CENTER);
		
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.SOUTH);
		
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
				status.setText(String.format("Botão do mouse foi pressionado no ponto: (%d; %d)", event.getX(), event.getY() ));
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				status.setText(String.format("Botão do mouse foi liberado no ponto: (%d; %d)", event.getX(), event.getY() )); 
			}
			
		});
		
		mousePanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {
				status.setText(String.format("Mouse foi arrastado no ponto: (%d; %d)", event.getX(), event.getY()));
			}

			@Override
			public void mouseMoved(MouseEvent event) {
				status.setText(String.format("O Mouse foi movido no ponto: (%d; %d)", event.getX(), event.getY()));
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new DesenhoCirculos();
	}
}

class Painel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.RED);
		g.drawOval(195, 100, 90, 55);
		g.fillOval(290, 100, 90, 55);
		
		int xValues[] = {20, 40, 50, 30, 20, 15};
		int yValues[] = {50, 50, 60, 80, 80, 60};
		Polygon polygon1 = new Polygon(xValues, yValues, 6);
		g.drawPolygon(polygon1);
	}
}

private class EventoDesenho implements ActionListener {
	int forma = 0;
	
	if (event.getSource() == Circulo) {
		forma = 0;
		status.setText("Forma Ativa: Circulo");
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
	}

	private void repaint() {
		
	}
}
