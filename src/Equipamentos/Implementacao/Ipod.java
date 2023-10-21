package Equipamentos.Implementacao;

import Equipamentos.Funcionalidades.Musica;

public class Ipod implements Musica {
    public void playMusic() {
        System.out.println("Tocando música");
    };

    public void stopMusic() {
        System.out.println("Pausando musica");
    };

    public void selectMusic() {
        System.out.println("Selecionando música");
    };

    public void nextSong() {
        System.out.println("Próxima música");
    };

    public void previousSong() {
        System.out.println("Música anterior");
    };

}
