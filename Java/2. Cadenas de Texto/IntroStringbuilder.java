public class IntroStringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola");

        // .Append: Añade al contenido al String.
        sb.append(" mundo mundo");
        System.out.println("Add: " + sb);

        // .Length: Muestra el número de carácteres.
        System.out.println("Length: " + sb.length());

        // .Replace: Reemplaza entre un rango del indice por el String agregado.
        System.out.println("Replace: " + sb.replace(0,4,"Adios"));

        // .toString: Convierte el Stringbuilder a String.
        String string = sb.toString();

        // .Insert: Inserta el texto en la posición especificada.
        sb.insert(5," querido");
        System.out.println("Insert: " + sb);

        // .deleteArtChar: Elimina un caracter.
        System.out.println("DeleteCharArt: " + sb.deleteCharAt(5));

        // .Delete: Elimina por el indice indicado.
        System.out.println("Delete: " + sb.delete(5,12));

        // .SubString: Devuelve el rango del indice.
        System.out.println("SubString: " + sb.substring(3,10));

        // .setChatArt: Modifica un solo carácter.
        sb.setCharAt(4, 'h');
        System.out.println("SetCharArt: " + sb);

        // .indexOf: Devuelve la primera posición del texto.
        System.out.println("IndexOf: " + sb.indexOf("mundo"));

        // .lastIndexOf: Devuelve la última posición del texto.
        System.out.println("LastIndexOf: " + sb.lastIndexOf("mundo"));

        // .Reverse: Da la vuelta al String.
        System.out.println("Reverse: " + sb.reverse());
    }
}
