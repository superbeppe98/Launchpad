package launchpad;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import javax.swing.*;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Launchpad extends JFrame {

    public Launchpad() {
        //Assegno il titolo della finestra
        super("LaunchPad");
        //Creo la sezione per i tasti
        Container c = this.getContentPane();
        //Setto la grigla contenente i tasti
        c.setLayout(new GridLayout(3, 3));
        //Imposto la griglia visibile
        c.setVisible(true);
        //Imposto la chiusura della finestra con X
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Imposto la chiusura visibile
        this.setVisible(true);
        //Assegno una dimensione in pixel alla finestra
        super.setSize(750, 750);
        //Setto il menù della finestra
        //Barra del Menù
        JMenuBar menu = new JMenuBar();
        //Collego alla pagina il menu
        this.setJMenuBar(menu);
        //Creazione sottomenù(Options)
        JMenu impostazioni = new JMenu("Opzioni");
        //Collego al menù il sottomenù
        menu.add(impostazioni);
        //Creazione casella del sottomenù
        JMenuItem avanzate = new JMenuItem("Impostazioni Avanzate");
        //Assegno alla casella un'azione
        avanzate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Impostazioni avanzate");
            }
        });
        //Assegno al sottomenù la casella
        impostazioni.add(avanzate);

        //Creazione Bottoni per Launchpad
        final JButton E = new JButton();
        final JButton D = new JButton();
        final JButton C = new JButton();
        final JButton R = new JButton();
        final JButton F = new JButton();
        final JButton V = new JButton();
        final JButton T = new JButton();
        final JButton G = new JButton();
        final JButton B = new JButton();

        //Posizionamento tasti al centro
        c.add(E);
        c.add(R);
        c.add(T);
        c.add(D);
        c.add(F);
        c.add(G);
        c.add(C);
        c.add(V);
        c.add(B);

        //Variabili caricamento file
        final String file_E = "media\\1.wav";
        final String file_D = "media\\2.wav";
        final String file_C = "media\\3.wav";
        final String file_R = "media\\4.wav";
        final String file_F = "media\\5.wav";
        final String file_V = "media\\6.wav";
        final String file_T = "media\\7.wav";
        final String file_G = "media\\8.wav";
        final String file_B = "media\\9.wav";

        //Musiche
        final Musica m_E = new Musica();
        final Musica m_D = new Musica();
        final Musica m_C = new Musica();
        final Musica m_R = new Musica();
        final Musica m_F = new Musica();
        final Musica m_V = new Musica();
        final Musica m_T = new Musica();
        final Musica m_G = new Musica();
        final Musica m_B = new Musica();

        //Aggiungi azione al tasto
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            //Funzioni per tasti premuti
            @Override
            public void keyPressed(KeyEvent e) {
                if ('E' == e.getKeyChar()) {
                    E.setBackground(Color.decode(colore()));
                    try {
                        m_E.play(file_E);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ('D' == e.getKeyChar()) {
                    D.setBackground(Color.decode(colore()));
                    try {
                        m_D.play(file_D);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ('C' == e.getKeyChar()) {
                    C.setBackground(Color.decode(colore()));
                    try {
                        m_C.play(file_C);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ('R' == e.getKeyChar()) {
                    R.setBackground(Color.decode(colore()));
                    try {
                        m_R.play(file_R);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ('F' == e.getKeyChar()) {
                    F.setBackground(Color.decode(colore()));
                    try {
                        m_F.play(file_F);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ('V' == e.getKeyChar()) {
                    V.setBackground(Color.decode(colore()));
                    try {
                        m_V.play(file_V);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ('T' == e.getKeyChar()) {
                    T.setBackground(Color.decode(colore()));
                    try {
                        m_T.play(file_T);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ('G' == e.getKeyChar()) {
                    G.setBackground(Color.decode(colore()));
                    try {
                        m_G.play(file_G);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ('B' == e.getKeyChar()) {
                    B.setBackground(Color.decode(colore()));
                    try {
                        m_B.play(file_B);
                    } catch (BasicPlayerException ex) {
                        Logger.getLogger(Launchpad.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            //Funzioni per tasti rilasciati
            @Override
            public void keyReleased(KeyEvent e) {
                if ('E' == e.getKeyChar()) {
                    E.setBackground((new JButton().getBackground()));
                }
                if ('D' == e.getKeyChar()) {
                    D.setBackground((new JButton().getBackground()));
                }
                if ('C' == e.getKeyChar()) {
                    C.setBackground((new JButton().getBackground()));
                }
                if ('R' == e.getKeyChar()) {
                    R.setBackground((new JButton().getBackground()));
                }
                if ('F' == e.getKeyChar()) {
                    F.setBackground((new JButton().getBackground()));
                }
                if ('V' == e.getKeyChar()) {
                    V.setBackground((new JButton().getBackground()));
                }
                if ('T' == e.getKeyChar()) {
                    T.setBackground((new JButton().getBackground()));
                }
                if ('G' == e.getKeyChar()) {
                    G.setBackground((new JButton().getBackground()));
                }
                if ('B' == e.getKeyChar()) {
                    B.setBackground((new JButton().getBackground()));
                }
            }
        });
    }

    //Funzione privata per settare i colori del tasto
    private String colore() {
        String colore = "";
        String colori[] = {"#ff0000", "#ff9900", "#ffff00", "#99ff00", "#00ff00", "#00ff99", "#00ffff", "#0099ff", "#0000ff", "#9900ff", "#ff00ff", "#ff0099"};
        colore = colori[(int) (Math.random() * (colori.length - 1))];
        return (colore);
    }
}
