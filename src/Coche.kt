
/**
 * Clase que representa un coche con ciertas características.
 *
 * @property marca La marca del coche.
 * @property modelo El modelo del coche.
 * @property numCaballos El número de caballos del coche.
 * @property numPuertas El número de puertas del coche (por defecto es 4).
 * @property matricula La matrícula del coche.
 * @property color El color del coche.
 */
class Coche(
    marca: String?,
    modelo: String?,
    numCaballos: Int?,
    numPuertas: Int? = 4,
    matricula: String?,
    color: String?
) {
    // Propiedades de la clase

    /**
     * La marca del coche.
     *
     * Se asegura de que la marca no esté vacía o nula.
     */
    var marca: String? = marca
        set(value) {
            require(!value.isNullOrBlank()) {"El coche ha de tener marca"}
            field = value.lowercase().replaceFirstChar { it.uppercase() }
        }

    /**
     * El modelo del coche.
     *
     * Se asegura de que el modelo no esté vacío o nulo.
     */
    var modelo: String? = modelo
        set(value) {
            require(!value.isNullOrBlank()) { "El coche ha de tener modelo" }
            field = value
        }

    /**
     * El número de caballos del coche.
     *
     * Se asegura de que el número de caballos esté en el rango válido (entre 70 y 700).
     */
    var numCaballos: Int? = numCaballos
        set(value) {
            require(value in 70..700) {"El coche ha de tener entre 70 y 700 caballos"}
            field = value
        }

    /**
     * El número de puertas del coche.
     *
     * Se asegura de que el número de puertas esté en el rango válido (entre 3 y 5).
     */
    var numPuertas: Int? = numPuertas
        set(value) {
            require(value in 3..5) {"El coche ha de tener entre 3 y 5 puertas"}
            field = value
        }

    /**
     * La matrícula del coche.
     *
     * Se asegura de que la matrícula siga el formato válido de matrícula española (Ej. 1234BBB).
     */
    var matricula: String? = matricula
        set(value) {
            require(value?.matches(Regex("^[0-9]{4}[B-DF-HJ-NP-TV-Z]{3}$")) == true) {"El coche ha de tener una matrícula que siga el formato válido de matrícula española (Ej. 1234BBB)"}
            field = value
        }

    /**
     * El color del coche.
     *
     * Se asegura de que el color no esté vacío o nulo.
     */
    var color: String? = color
        set(value) {
            require(!value.isNullOrBlank()) {"El coche ha de tener color"}
            field = value
        }

    /**
     * Representación textual del coche.
     *
     * @return Una cadena que contiene las características del coche.
     */
    override fun toString(): String {
        return "marca: $marca, modelo: $modelo, caballos: $numCaballos, puertas: $numPuertas, matrícula: $matricula, color: $color"
    }
}