package com.company;

public class Password {
    //Defino los parametros para que la contraseña sea fuerte.
    private final static int DEFAULT_LONG = 9;
    private final static int SECURE_PASSWD_MAYUS = 2;
    private final static int SECURE_PASSWD_MINUS = 1;
    private final static int SECURE_PASSWD_NUM = 3;

    private int longitud;
    private String contraseña;

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    public Password(String contraseña) {
        this.longitud = DEFAULT_LONG;
        this.contraseña = contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return this.longitud;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public String generarPassword() {

        contraseña = "";
        for (int i = 0; i < this.longitud; i++) {

            //Con un switch random genero letras y numeros aleatorios para la cadena.
            switch ((int) (Math.random() * 3)) {
                case 0:
                    contraseña += (char) (Math.random() * 26 + 'A');
                    break;
                case 1:
                    contraseña += (char) (Math.random() * 26 + 'a');
                    break;
                case 2:
                    contraseña += (char) (Math.random() * 10 + '0');
                    break;
            }
        }
        return contraseña;
    }

    public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;

        //Busco la cantidad de mayusculas, minusculas y numeros en la contraseña.
        for (int i = 0; i < this.longitud; i++) {
            if (this.contraseña.charAt(i) >= 'A' && this.contraseña.charAt(i) <= 'Z')
                mayusculas++;
            if (this.contraseña.charAt(i) >= 'a' && this.contraseña.charAt(i) <= 'z')
                minusculas++;
            if (this.contraseña.charAt(i) >= '0' && this.contraseña.charAt(i) <= '9')
                numeros++;
        }
        //Retorno true si cumple con los requisitos definidos arriba.
        return (mayusculas > SECURE_PASSWD_MAYUS && minusculas > SECURE_PASSWD_MINUS && numeros > SECURE_PASSWD_NUM)
                ? true : false;
    }
}

