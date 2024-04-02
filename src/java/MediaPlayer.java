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
    * Es necesario armar este metodo? O lo que realmente importa es la implementacion del adapter
    * *****************************
    */
    public void play(){
        media.play();
    }
}
