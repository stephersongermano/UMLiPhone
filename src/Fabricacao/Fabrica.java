package Fabricacao;

import Equipamentos.Implementacao.Iphone;
import Equipamentos.Implementacao.Ipod;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();
        Ipod iPod = new Ipod();

        System.out.println("== IPod ==");
        System.out.println("-Musica-");
        iPod.playMusic();
        iPod.stopMusic();
        iPod.selectMusic();
        iPod.nextSong();
        iPod.previousSong();

        System.out.println("== IPhone ==");
        System.out.println("-Internet-");
        iPhone.internetPage();
        iPhone.newInternetPage();
        iPhone.updatePage();
        System.out.println("-Telefone-");
        iPhone.toConnect();
        iPhone.toMeet();
        iPhone.startVoicemail();
        System.out.println("-Musica-");
        iPhone.playMusic();
        iPhone.stopMusic();
        iPhone.selectMusic();
        iPhone.nextSong();
        iPhone.previousSong();

    }
}
