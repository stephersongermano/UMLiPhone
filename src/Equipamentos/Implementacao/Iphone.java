package Equipamentos.Implementacao;

import Equipamentos.Funcionalidades.Internet;
import Equipamentos.Funcionalidades.Musica;
import Equipamentos.Funcionalidades.Telefone;

public class Iphone implements Musica, Internet, Telefone {

    // Internet
    public void internetPage() {
        System.out.println("Página aberta");
    }

    public void newInternetPage() {
        System.out.println("Adicionar nova página");
    }

    public void updatePage() {
        System.out.println("Atualizar página");
    }

    // Telefone
    public void toConnect() {
        System.out.println("Ligar via equipamento Iphone");
    }

    public void toMeet() {
        System.out.println("Atender via equipamento Iphone");
    }

    public void startVoicemail() {
        System.out.println("Iniciar correio de voz via equipamento iPhone");
    }

    // Musica
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
