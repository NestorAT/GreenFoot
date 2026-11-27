import greenfoot.*;

// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mi mundo esta lleno de aventuras y hay frutas infinitas que caen del cielo
 *
 * @author Nestor
 * @version Alfa1
 */
public class FruitPlanet extends World
{
    public FruitPlanet()
    {
        super(600, 400, 1);

        Player babyAdventure = new Player();
        addObject(babyAdventure, 0, 0);

        // Añadir abeja
        addObject(new Bee(), 300, 0);

        // Crear tres filas de estrellas
        int initX = 30;
        int initY = 50;

        crearFila(5,initX, initY);
        crearFila(5,initX, initY);
        crearFila(2,initX, initY);
        
        for (int i = 0; i<4; i++){
            crearFila(initX, initY);
            initY = initY +50;
        }
        showtext("value of y " + initY, 100, 100);
    }

    /**
     * Crea una fila horizontal de estrellas.
     */
    private void crearFila(int cantidad, int y, int margen)
    {
        if (cantidad <= 0)
        {
            return;
        }

        int espacioDisponible = getWidth() - (margen * 2);
        int separacion = espacioDisponible / (cantidad + 1);

        for (int i = 1; i <= cantidad; i++)
        {
            addObject(new SpaceStar(), margen + (separacion * i), y);
        }
    }
}