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
     */
    public FruitPlanet()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        // Crear jugador
        Player babyAdventure = new Player();
        addObject(babyAdventure, 0, 0);

        // Añadir abeja
        addObject(new Bee(), 300, 0);

        // Crear una fila de 5 estrellas en y = 350, dejando un margen de 20.
        crearFila(5, 350, 20);
    }

    /**
     * Crea una fila horizontal de estrellas.
     */
    private void crearFila(int cantidad, int y, int margen)
    {
        // Si la cantidad no es valida, no hacemos nada.
        if (cantidad <= 0)
        {
            return;
        }

        // Calculamos el espacio disponible y la separacion entre estrellas.
        int espacioDisponible = getWidth() - (margen * 2);
        int separacion = espacioDisponible / (cantidad + 1);

        // Repetimos el proceso hasta crear todas las estrellas.
        for (int i = 1; i <= cantidad; i++)
        {
            addObject(new SpaceStar(), margen + (separacion * i), y);
        }
    }
}
