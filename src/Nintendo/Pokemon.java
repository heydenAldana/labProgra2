package Nintendo;

class Pokemon 
{
    // Atributos
    private String nombre;
    private int ataque, vida;
    
    // Constructor
    public Pokemon(String nombre, int ataque, int vida)
    {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }
    
    // Funciones get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
