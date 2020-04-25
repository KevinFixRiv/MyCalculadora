/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculadora;
import java.lang.Math;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author cedewolf
 */
public class myVista extends JFrame implements ActionListener{
    
    //Instancia de los cuadros de texto 
    // El objeto calculadora es el que realmente realiza las operaciones
    	
        private Calculadora micalculadora = new Calculadora();
       
        private boolean nuevo=true; //Variable global 
        
        //Instancia los elementos del menu superior y sus elementos 
	private final JMenuBar barraMenus = new JMenuBar();
        private final JMenu archivo 	  = new JMenu("File");
	private final JMenuItem salir   = new JMenuItem("Exit");
        private final JMenu configuracion	  = new JMenu("Edit");
	private final JMenuItem standard  = new JMenuItem("Standard");
        private final JMenuItem scientist  = new JMenuItem("Scientist");
        private final JMenu help             = new JMenu("Help");
        private final JMenuItem about        = new JMenuItem("About");
        
        //Instancia de Botones
	private final JTextField display = new JTextField();
        private final JTextField display2 = new JTextField();
        private final JButton b0 = new JButton("0");
	private final JButton b1 = new JButton("1");
	private final JButton b2 = new JButton("2");
	private final JButton b3 = new JButton("3");
	private final JButton b4 = new JButton("4");
	private final JButton b5 = new JButton("5");
	private final JButton b6 = new JButton("6");
	private final JButton b7 = new JButton("7");
	private final JButton b8 = new JButton("8");
	private final JButton b9 = new JButton("9");
	private final JButton mas = new JButton("+");
	private final JButton menos = new JButton("-");
        private final JButton div = new JButton("/");
        private final JButton multi = new JButton("*");
	private final JButton igual =new JButton("=");
        private final JButton ac   = new JButton("AC");
        private final JButton c   = new JButton("←");
        private final JButton sin   = new JButton("sin");
        private final JButton cos   = new JButton("cos");
        private final JButton tan   = new JButton("tan");
        private final JButton inv   = new JButton("1/x");
        private final JButton pot2   = new JButton("x^2");
        private final JButton pot3   = new JButton("x^3");
        private final JButton raiz2   = new JButton("√x");
        private final JButton raiz3   = new JButton("3√");
        private final JButton ln   = new JButton("ln");
        private final JButton log   = new JButton("log");
        private final JButton punto = new JButton(".");
        //Constantes
        private final JButton e   = new JButton("e");
        private final JButton pi   = new JButton("π");
        //Instancia de radiobotones
        private final ButtonGroup tipo = new ButtonGroup();
        private final JRadioButton deg = new JRadioButton("DEG",true);
        private final JRadioButton rad = new JRadioButton("RAD");
        //Intancia del fondo
         
        
    public myVista() //Metodo Contructor clase vista
    {

        initComponents();

    }

    public final void initComponents() {
        this.setTitle("MyCalculator");
        this.setResizable(false); //Deshabilita el boton de minimizar 
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLayout(null); // Se deshabilita el Gestor de Distribución
        this.setBounds(100, 100, 290, 535);
        this.setJMenuBar(barraMenus);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black); //Configura el fondo del panel en negro
        // Diseña el menu
        barraMenus.add(archivo);
        barraMenus.add(configuracion);
        barraMenus.add(help);
        archivo.add(salir);
        configuracion.add(standard);
        configuracion.add(scientist);
        help.add(about);
        
        //Etiqueta con mi nombre
        JLabel etiqueta1 = new JLabel("FIGUEROA RIVERA KEVIN");
        // Al desabilitar el LayoutManager, el programador tiene
        // la responsabilidad de situar los componentes
        display.setBounds(10, 5, 265, 40);
        display2.setBounds(10, 45, 265, 40);
        //_Posicionamiento de componentes
        sin.setBounds(10, 95, 55, 35);
        cos.setBounds(80, 95, 55, 35);
        tan.setBounds(150, 95, 55, 35);
        ln.setBounds(220, 95, 55, 35);

        inv.setBounds(10, 130, 55, 35);
        pot2.setBounds(80, 130, 55, 35);
        pot3.setBounds(150, 130, 55, 35);
        log.setBounds(220, 130, 55, 35);

        raiz2.setBounds(10, 165, 55, 35);
        raiz3.setBounds(80, 165, 55, 35);
        c.setBounds(150, 165, 55, 35);
        ac.setBounds(220, 165, 55, 35);

        b7.setBounds(10, 200, 55, 50);
        b8.setBounds(80, 200, 55, 50);
        b9.setBounds(150, 200, 55, 50);
        div.setBounds(220, 200, 55, 50);

        b4.setBounds(10, 250, 55, 50);
        b5.setBounds(80, 250, 55, 50);
        b6.setBounds(150, 250, 55, 50);
        multi.setBounds(220, 250, 55, 50);

        b1.setBounds(10, 300, 55, 50);
        b2.setBounds(80, 300, 55, 50);
        b3.setBounds(150, 300, 55, 50);
        menos.setBounds(220, 300, 55, 50);

        e.setBounds(10, 350, 55, 50);
        b0.setBounds(80, 350, 55, 50);
        pi.setBounds(150, 350, 55, 50);
        mas.setBounds(220, 350, 55, 50);
        
        punto.setBounds(80,400,55,50);
        igual.setBounds(150,400,125,50);
        
        //Configuracion de radiobotones
        deg.setBounds(10,400,55,25);
        rad.setBounds(10,425,55,25);
        etiqueta1.setBounds(10,458,290,15);
        etiqueta1.setForeground(Color.white);
        
        //Configuracion del cuadro de texto
        display.setBackground(Color.black);
        display.setForeground(Color.red);
        display.setFont(new Font("Consolas", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.LEFT);
        display.setEditable(false);
        display2.setBackground(Color.black);
        display2.setForeground(Color.orange);
        display2.setFont(new Font("Consolas", Font.BOLD, 26));
        display2.setHorizontalAlignment(JTextField.RIGHT);
        display2.setEditable(false);
        //Configuracion de los contenedores
        rad.setSelected(false);
        tipo.add(rad);
        tipo.add(deg);
        b7.setFont(new Font("Consolas", Font.BOLD, 30));
        b8.setFont(new Font("Consolas", Font.BOLD, 30));
        b9.setFont(new Font("Consolas", Font.BOLD, 30));
        b4.setFont(new Font("Consolas", Font.BOLD, 30));
        b5.setFont(new Font("Consolas", Font.BOLD, 30));
        b6.setFont(new Font("Consolas", Font.BOLD, 30));
        b1.setFont(new Font("Consolas", Font.BOLD, 30));
        b2.setFont(new Font("Consolas", Font.BOLD, 30));
        b3.setFont(new Font("Consolas", Font.BOLD, 30));
        b0.setFont(new Font("Consolas", Font.BOLD, 30));
        punto.setFont(new Font("Consolas", Font.BOLD, 35));
        div.setFont(new Font("Consolas", Font.BOLD, 30));
        multi.setFont(new Font("Consolas", Font.BOLD, 30));
        menos.setFont(new Font("Consolas", Font.BOLD, 30));
        mas.setFont(new Font("Consolas", Font.BOLD, 30));
        igual.setFont(new Font("Consolas", Font.BOLD, 40));
        e.setFont(new Font("Consolas", Font.BOLD, 30));
        pi.setFont(new Font("Consolas", Font.BOLD, 30));
        c.setFont(new Font("Consolas", Font.BOLD, 25));
        c.setBackground(Color.red);
        c.setForeground(Color.white);
        ac.setBackground(Color.red);
        ac.setForeground(Color.white);
        igual.setBackground(Color.red);
        igual.setForeground(Color.white);
        sin.setBackground(Color.gray);
        sin.setForeground(Color.white);
        cos.setBackground(Color.gray);
        cos.setForeground(Color.white);
        tan.setBackground(Color.gray);
        tan.setForeground(Color.white);
        ln.setBackground(Color.gray);
        ln.setForeground(Color.white);
        inv.setBackground(Color.gray);
        inv.setForeground(Color.white);
        pot2.setBackground(Color.gray);
        pot2.setForeground(Color.white);
        pot3.setBackground(Color.gray);
        pot3.setForeground(Color.white);
        log.setBackground(Color.gray);
        log.setForeground(Color.white);
        raiz2.setBackground(Color.gray);
        raiz2.setForeground(Color.white);
        raiz3.setBackground(Color.gray);
        raiz3.setForeground(Color.white);
        mas.setBackground(Color.LIGHT_GRAY);
        menos.setBackground(Color.LIGHT_GRAY);
        div.setBackground(Color.LIGHT_GRAY);
        multi.setBackground(Color.LIGHT_GRAY);

        //Se agregan los contenedores al panel 
        this.add(etiqueta1);
        this.add(display2);
        this.add(display);
        this.add(e);
        this.add(pi);
        this.add(div);
        this.add(multi);
        this.add(c);
        this.add(ac);
        this.add(raiz2);
        this.add(raiz3);
        this.add(inv);
        this.add(pot2);
        this.add(pot3);
        this.add(log);
        this.add(sin);
        this.add(tan);
        this.add(ln);
        this.add(cos);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b0);
        this.add(mas);
        this.add(menos);
        this.add(igual);
        this.add(deg);
        this.add(rad);
        this.add(punto);
        
        //Metodos que se invocan al precionar las teclas
        salir.addActionListener(this);
        e.addActionListener(this);
        b0.addActionListener(this);
        pi.addActionListener(this);
        div.addActionListener(this);
        multi.addActionListener(this);
        c.addActionListener(this);
        ac.addActionListener(this);
        raiz3.addActionListener(this);
        raiz2.addActionListener(this);
        inv.addActionListener(this);
        pot2.addActionListener(this);
        pot3.addActionListener(this);
        log.addActionListener(this);
        sin.addActionListener(this);
        tan.addActionListener(this);
        ln.addActionListener(this);
        cos.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        mas.addActionListener(this);
        menos.addActionListener(this);
        igual.addActionListener(this);
        punto.addActionListener(this);
        
        // Al ser una tecla con dos símbolos en la cara le asignamos
        // un Listener diferente
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarac(); // <== Método que se invoca cuando se hace click sobre la opción tecla ac
            }
        });
        // Agrega Listener al boton 'X' del JFrame
        class MyWindowAdapter extends WindowAdapter {

            public void windowClosing(WindowEvent e) {
                exit();
            }
        }
        addWindowListener(new MyWindowAdapter());
        
    }
    
    // Gestor de eventos
    //Cada Listener tiene una serie de métodos que debemos implementar obligatoriamente. tal como -> actionPerformed    
    public void actionPerformed(java.awt.event.ActionEvent objetoEvento) {
        Object fuenteDelEvento = objetoEvento.getSource();

        // Identifica sobre qué objeto generó el evento
        if (fuenteDelEvento == salir)
        {
            exit();  // Cierra el Programa
        }
        
        else if(fuenteDelEvento == b0){
            gestionarb0();
        }
        else if(fuenteDelEvento == b1){
            gestionarb1();
        }
        else if(fuenteDelEvento == b2){
            gestionarb2();
        }
        else if(fuenteDelEvento == b3){
            gestionarb3();
        }
        else if(fuenteDelEvento == b4){
            gestionarb4();
        }
        else if(fuenteDelEvento == b5){
            gestionarb5();
        }
        else if(fuenteDelEvento == b6){
            gestionarb6();
        }
        else if(fuenteDelEvento == b7){
            gestionarb7();
        }
        else if(fuenteDelEvento == b8){
            gestionarb8();
        }
        else if(fuenteDelEvento == b9){
            gestionarb9();
        }
        else if(fuenteDelEvento == punto){
            gestionarpunto();
        }
        else if(fuenteDelEvento == sin){
            gestionarsin();
        }
        else if(fuenteDelEvento == cos){
            gestionarcos();
        }
        else if(fuenteDelEvento == tan){
            gestionartan();
        }
        else if(fuenteDelEvento == ln){
            gestionarln();
        }
        else if(fuenteDelEvento == inv){
            gestionarinv();
        }
        else if(fuenteDelEvento == pot2){
            gestionarpot2();
        }
        else if(fuenteDelEvento == pot3){
            gestionarpot3();
        }
        else if(fuenteDelEvento == log){
            gestionarlog();
        }
        else if(fuenteDelEvento == raiz2){
            gestionarraiz2();
        }
        else if(fuenteDelEvento == raiz3){
            gestionarraiz3();
        }
        else if(fuenteDelEvento == c){
            gestionarc();
        }
        else if(fuenteDelEvento == ac){
            gestionarac();
        }
        else if(fuenteDelEvento == div){
            gestionardiv();
        }
        else if(fuenteDelEvento == multi){
            gestionarmulti();
        }
        else if(fuenteDelEvento == menos){
            gestionarmenos();
        }
        else if(fuenteDelEvento == mas){
            gestionarmas();
        }
        else if(fuenteDelEvento == pi){
            gestionarpi();
        }
        else if(fuenteDelEvento == e){
            gestionare();
        }
        else if(fuenteDelEvento == igual){
            gestionarigual();
        }
    }

    // Salir
    public void salir(java.awt.event.ActionEvent evt) {
        exit();
    }

    public void exit() {
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "Exit", "warning", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void gestionarac() {
        // Codigo para procesar CE
        display.setText("");
        display2.setText("");
        nuevo = true;
    }

    public void gestionarb0() {
        display.setText(display.getText()+"0");
    }

    public void gestionarb1() {
        display.setText(display.getText()+"1");
        
    }

    public void gestionarb2() {
        display.setText(display.getText()+"2");
        
    }

    public void gestionarb3() {
        display.setText(display.getText()+"3");
 
    }

    public void gestionarb4() {
        display.setText(display.getText()+"4");
      
    }

    public void gestionarb5() {
        display.setText(display.getText()+"5");
        
    }

    public void gestionarb6() {
        display.setText(display.getText()+"6");
       
    }

    public void gestionarb7() {
        display.setText(display.getText()+"7");
       
    }

    public void gestionarb8() {
        display.setText(display.getText()+"8");
       
    }

    public void gestionarb9() {
        display.setText(display.getText()+"9");
    }

    public void gestionarpunto() {
        String cadena;
        cadena = display.getText();
        if(cadena.length()<=0){
            display.setText("0.");
        }
        else{
             display.setText(display.getText()+".");
        } 
    }

    public void gestionarsin() {
        String cad;
        cad = display.getText();
        display.setText("sin"+cad);
    }

    public void gestionarcos() {
        String cad;
        cad = display.getText();
        display.setText("cos"+cad);
  
    }

    public void gestionartan() {
        String cad;
        cad = display.getText();
        display.setText("tan"+cad);
    }

    public void gestionarln() {
        String cad;
        cad = display.getText();
        display.setText("ln"+cad);
    }

    public void gestionarpot2() {
        String cad;
        cad = display.getText();
        display.setText("2pow"+cad);
    }

    public void gestionarinv() {
        String cad;
        cad = display.getText();
        display.setText("inv"+cad);
    }

    public void gestionarpot3() {
        String cad;
        cad = display.getText();
        display.setText("3pow"+cad);
    }

    public void gestionarlog() {
        String cad;
        cad = display.getText();
        display.setText("log"+cad);
    }

    public void gestionarraiz2() {
        String cad;
        cad = display.getText();
        display.setText("√"+cad);
    }

    public void gestionarraiz3() {
        String cad;
        cad = display.getText();
        display.setText("3√"+cad);
    }

    public void gestionarc() {
        String cad;
        cad = display.getText();
        if(cad.length()>0){
            cad = cad.substring(0,cad.length()-1);
            display.setText(cad);
        }
    }
    
    public void gestionardiv() {
        String cad;
        cad = display.getText();
        display.setText(cad+"/");
        
    }

    public void gestionarmulti() {
        String cad;
        cad = display.getText();
        display.setText(cad+"*");
        
    }

    public void gestionarmenos() {
        String cad;
        cad = display.getText();
        display.setText(cad+"-");
        
    }

    public void gestionarmas() {
        String cad;
        cad = display.getText();
        display.setText(cad+"+");
        
       
    }

    public void gestionarpi() {
        String pi;
        pi = "3.1416";
        display.setText(display.getText()+pi);
        
    }

    public void gestionare() {
        String e;
        e = "2.7182";
        display.setText(display.getText()+e);
    }
    

    public void gestionarigual() {
        String cad;
        cad = display.getText();
        double numero;
        double num = micalculadora.operacion(cad);
        if(deg.isSelected()){
            numero = Math.toDegrees(num); 
            display2.setText(numero+"");
        }
        if(rad.isSelected()){
            display2.setText(num+"");
        }
        
            
    }
}
