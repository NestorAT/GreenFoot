import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Mi mundo esta lleno de aventuras y hay frutas infinitas que caen del cielo
 * 
 * @author Nestor
 * @version Alfa1
 */
public class FruitPlanet extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FruitPlanet()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //crear jugador
        Player babyAdventure = new Player();
        //Add player to our new world
        addObject(babyAdventure,0,0);
        //Add new bee class
        addObject(new Bee(),300,0);

        //Crear una fila de 5 estrellas en y = 350
        crearFila(5, 350);
    }

    /**
     * Crea una fila horizontal de n estrellas con la misma
     * distancia entre cada dos adyacentes.
     */
    private void crearFila(int n, int y)
    {
        int separacion = getWidth() / (n + 1);

        for (int i = 1; i <= n; i++)
        {
            addObject(new SpaceStar(), separacion * i, y);
        }
    }
}
