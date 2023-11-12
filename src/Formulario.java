import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

import modelo.DadosForm;

import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
 
public class Formulario extends JFrame implements ActionListener {
 
    // Components of the Form
    private Container c;
    private JLabel titulo;
    private JLabel nome;
    private JTextField tnome;
    private JLabel email;
    private JTextField temail;
    private JLabel cel;
    private JTextField tcel;
    private JLabel genero;
    private JRadioButton feminino;
    private JRadioButton masculino;
    private ButtonGroup gengp;
    private JLabel nascimento;
    /*private JComboBox dia;
    private JComboBox mes;*/
    private JTextField tnascimento;
    /*private JComboBox ano;*/
    private JLabel end;
    /*private JTextArea tend;*/
    private JTextField tend;
    /*private JCheckBox term;*/
    private JLabel peso;
    private JTextField tpeso;
    private JLabel altura;
    private JTextField taltura;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
 /*
    private String dias[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String meses[]
        = { "Jan", "Fev", "Mar", "Abr",
            "Mai", "Jun", "Jul", "Ago",
            "Sep", "Out", "Nov", "Dez" };
    private String anos[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020"};
 */
    // constructor, to initialize the components
    // with default values.
    public Formulario()
    {
        setTitle("Formulário");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        titulo = new JLabel("Formulário");
        titulo.setFont(new Font("Arial", Font.PLAIN, 30));
        titulo.setSize(300, 30);
        titulo.setLocation(300, 30);
        c.add(titulo);
 
        nome = new JLabel("Nome");
        nome.setFont(new Font("Arial", Font.PLAIN, 18));
        nome.setSize(100, 20);
        nome.setLocation(100, 100);
        c.add(nome);
 
        tnome = new JTextField();
        tnome.setFont(new Font("Arial", Font.PLAIN, 15));
        tnome.setSize(190, 20);
        tnome.setLocation(200, 100);
        c.add(tnome);
        
        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 18));
        email.setSize(100, 20);
        email.setLocation(100, 150);
        c.add(email);
 
        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 20);
        temail.setLocation(200, 150);
        c.add(temail);
 
        cel = new JLabel("Celular");
        cel.setFont(new Font("Arial", Font.PLAIN, 18));
        cel.setSize(100, 20);
        cel.setLocation(100, 200);
        c.add(cel);
 
        try {
			tcel = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        tcel.setFont(new Font("Arial", Font.PLAIN, 15));
        tcel.setSize(150, 20);
        tcel.setLocation(200, 200);
        c.add(tcel);
 
        genero = new JLabel("Genero");
        genero.setFont(new Font("Arial", Font.PLAIN, 18));
        genero.setSize(100, 20);
        genero.setLocation(100, 250);
        c.add(genero);
 
        feminino = new JRadioButton("Feminino");
        feminino.setFont(new Font("Arial", Font.PLAIN, 14));
        feminino.setSelected(true);
        feminino.setSize(85, 20);
        feminino.setLocation(200, 250);
        c.add(feminino);
 
        masculino = new JRadioButton("Masculino");
        masculino.setFont(new Font("Arial", Font.PLAIN, 14));
        masculino.setSelected(false);
        masculino.setSize(90, 20);
        masculino.setLocation(290, 250);
        c.add(masculino);
 
        gengp = new ButtonGroup();
        gengp.add(feminino);
        gengp.add(masculino);
 
        nascimento = new JLabel("Nascimento(ANO-M-D)");
        nascimento.setFont(new Font("Arial", Font.PLAIN, 18));
        nascimento.setSize(100, 20);
        nascimento.setLocation(100, 300);
        c.add(nascimento);
 
        /*dia = new JComboBox(dias);
        dia.setFont(new Font("Arial", Font.PLAIN, 15));
        dia.setSize(50, 20);
        dia.setLocation(200, 250);
        c.add(dia);
 
        mes = new JComboBox(meses);
        mes.setFont(new Font("Arial", Font.PLAIN, 15));
        mes.setSize(60, 20);
        mes.setLocation(250, 250);
        c.add(mes);
 
        /*ano = new JComboBox(anos);
        ano.setFont(new Font("Arial", Font.PLAIN, 15));
        ano.setSize(60, 20);
        ano.setLocation(320, 250);
        c.add(ano);*/
        
        try {
			tnascimento = new JFormattedTextField(new MaskFormatter("####-##-##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        tnascimento.setFont(new Font("Arial", Font.PLAIN, 15));
        tnascimento.setSize(100, 20);
        tnascimento.setLocation(200, 300);
        c.add(tnascimento);
 
        end = new JLabel("País");
        end.setFont(new Font("Arial", Font.PLAIN, 18));
        end.setSize(100, 20);
        end.setLocation(100, 350);
        c.add(end);
 
        tend = new JTextField();
        tend.setFont(new Font("Arial", Font.PLAIN, 15));
        tend.setSize(200, 20);
        tend.setLocation(200, 350);
        /*tend.setLineWrap(true);*/
        c.add(tend);
        
        peso = new JLabel("Peso (KG)");
        peso.setFont(new Font("Arial", Font.PLAIN, 18));
        peso.setSize(100, 20);
        peso.setLocation(100, 400);
        c.add(peso);
 
        tpeso = new JTextField();
        tpeso.setFont(new Font("Arial", Font.PLAIN, 15));
        tpeso.setSize(100, 20);
        tpeso.setLocation(200, 400);
        c.add(tpeso);
        
        altura = new JLabel("Altura (m)");
        altura.setFont(new Font("Arial", Font.PLAIN, 18));
        altura.setSize(100, 20);
        altura.setLocation(100, 450);
        c.add(altura);
 
        try {
			taltura = new JFormattedTextField(new MaskFormatter("#.##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        taltura.setFont(new Font("Arial", Font.PLAIN, 15));
        taltura.setSize(100, 20);
        taltura.setLocation(200, 450);
        c.add(taltura);
 /*
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);*/
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 500);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 500);
        reset.addActionListener(this);
        c.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 15));
        res.setSize(500, 25);
        res.setLocation(208, 525);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
 
        setVisible(true);
    }
 
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            /*if (term.isSelected()) {*/
                String nome = "Nome : " + tnome.getText() +"\n";
                String email = "Email : " + temail.getText()+"\n";
                String celular = "Celular : " + tcel.getText()+"\n";
                String genero;
                if (feminino.isSelected())
                    genero = "Genero : Feminino"
                            + "\n";
                else
                    genero = "Genero : Masculino"
                            + "\n";
                String nascimento
                    = "Data de Nascimento : "
                      + /*(String)dia.getSelectedItem()
                      + "/" + (String)mes.getSelectedItem()
                      + "/" + tnascimento.getText()
                      + "\n";*/ tnascimento.getText() + "\n";
 
                String endereco = "Endereço : " + tend.getText() + "\n";
                
                String peso = "Peso: " + tpeso.getText() + "\n";
                String altura = "Altura: " + taltura.getText() + "\n";
                
                String[] partsp = (peso).split(" ");
                double dpeso = Double.parseDouble(partsp[1]);
                
                String[] partsa = (altura).split(" ");
                double daltura = Double.parseDouble(partsa[1]);
               
                
                double imc = dpeso / (daltura * daltura);
                BigDecimal bd = new BigDecimal(imc).setScale(2, RoundingMode.HALF_UP);
                imc = bd.doubleValue();
                String situacaoIMC;
                if (imc < 18.5) {
                	situacaoIMC = "Abaixo do peso";
                } else if (imc < 24.9) {
                	situacaoIMC = "Peso normal";
                } else if (imc < 29.9) {
                	situacaoIMC = "Sobrepeso";
                } else {
                	situacaoIMC = "Obesidade";
                }
                
                
                tout.setText(nome + celular + genero + nascimento + endereco + peso + altura + "IMC: " + imc + "\n" + "Situação: " + situacaoIMC);
                tout.setEditable(false);
                
                
                
                DadosForm dados = new DadosForm(
                	
                	    tnome.getText(),
                	    temail.getText(),
                	    tcel.getText(),
                	    (feminino.isSelected()) ? "Feminino" : "Masculino",  // Ajuste para refletir o gênero corretamente
                	    tnascimento.getText(),
                	    tend.getText(),
                	    tpeso.getText(),
                	    taltura.getText(),
                	    String.valueOf(imc),
                	    situacaoIMC
                	);
                		
                int result = dados.save();
                
                if (result > 0) {
                   System.out.println("Cadastro realizado com sucesso.\n");
                } else {
                	System.out.println("Erro ao cadastrar. Por favor, tente novamente.");
                }
                
                res.setText("Cadastro realizado..");
                
                
            }
            /*else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }*/
        
 
        if(e.getSource() == reset) {
            String def = "";
            tnome.setText(def);
            temail.setText(def);
            tend.setText(def);
            tcel.setText(def);
            tpeso.setText(def);
            tpeso.setText(def);
            res.setText(def);
            tout.setText(def);
           /* term.setSelected(false);*/
            /*dia.setSelectedIndex(0);
            mes.setSelectedIndex(0);*/
            tnascimento.setText(def);
            resadd.setText(def);
        }
    }
}
 
// Driver Code
class Registration {
 
    public static void main(String[] args) throws Exception
    {
        Formulario f = new Formulario();
    }
}