public class MediaPlayer {

    private Media media;

    public MediaPlayer(Media media){
        media = media;
    }

    //TODO
    /*
    * *********CONSULTAS***********
    * Es una sola media? o una lista de medias,
    * Se instancia una sola media para el mediaPlayer, o puede cambiar?
    * *****************************
    */
    public void ponerPlay(){
        media.play();
    }
}
