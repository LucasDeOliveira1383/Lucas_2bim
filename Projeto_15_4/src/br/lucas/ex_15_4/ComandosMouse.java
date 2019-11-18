package br.lucas.ex_15_4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;


public class ComandosMouse extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel mousePanel;
	
	Painel painel;
	
	EventoDesenho desenho;
	
	private JToolBar barraFerramenta;
	
	private JButton Opcao = new JButton ("Circulo");
	
	private Color CorFigura = Color.RED;
	private Color UltimaCor = Color.RED;
	
	public ComandosMouse() {
		super("Trabalho de Projeto de Software I (2º Bimestre) - Exercício 15.4");
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		barraFerramenta = new JToolBar();
		add(barraFerramenta, BorderLayout.NORTH);
		
		mousePanel = new JPanel();
		add(mousePanel, BorderLayout.CENTER);
		
		JButton button = new JButton("Circulo | Linha | Retângulo | Triângulo");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
			
		});
		
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
				status.setText(String.format( "Mouse foi \"clicado\" no ponto: (%d; %d) %s", event.getX(), event.getY(), detalhe));
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent event) {
				status.setText(String.format( "O botão do mouse foi pressionado no ponto: (%d; %d)", event.getX(),event.getY() ));
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				status.setText(String.format( "O mouse foi solto no ponto: (%d; %d)", event.getX(), event.getY()));
			}
			
		});
		
		mousePanel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent event) {
				status.setText(String.format( "Mouse foi movimentado no ponto: (%d; %d)", event.getX(), event.getY()));
			}
			
			@Override
			public void mouseDragged(MouseEvent event) {
				status.setText(String.format(" Mouse foi arrastado no ponto: (%d; %d)", event.getX(), event.getY() ));
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String []a) {
		new ComandosMouse();
	}
}

class Painel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.drawTriangle(120, 120, 120);
	}
}

class EventoDesenho implements ActionListener {
	int forma = 0;

	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == Linha) {
			forma = 0;
			status.setText(" Forma ativa: Linha");
			repaint();
		}
		
		if(event.getSource() == Circulo) {
			forma = 1;
			status.setText(" Forma ativa: Circulo");
			repaint();
		}
		
		if(event.getSource() == Retangulo) {
			forma = 2;
			staus.setText(" Forma ativa: Retangulo");
			repaint();
		}
		
		if(event.getSource() == Triangulo) {
			forma = 3;
			status.setText(" Forma ativa: Triangulo");
			repaint();
		}
	}

	private void repaint() {
		
	}
}
