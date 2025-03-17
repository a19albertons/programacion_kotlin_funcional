

fun main() {
    val page = html {
        head {
            title("Página con lista")
        }
        body {
            h1("Lista de elementos")
            ul {
                li("Elemento 1")
                li("Elemento 2")
                li("Elemento 3")
            }
        }
    }

    println(page)
}

class Head {
    var content: String = ""
    fun title(text:String) {
        content += "<title>$text</title>"
    }
}

class HTML {
    private val children = mutableListOf<String>()
    fun inicio(){
        children.add("<html>")
    }
    fun head(init: Head.() -> Unit) {
        val head = Head()
        head.init()
        children.add("<head>${head.content}</head>")
    }

    fun body(init: Body.() -> Unit) {
        val body = Body()
        body.init()
        children.add("<body>${body.content}</body>")
    }
    fun final(){
        children.add("</html>")
    }

    override fun toString(): String {
        return children.joinToString("\n")
    }
}

class Body {
    var content: String = ""

    fun p(text: String) {
        content += "<p>$text</p>"
    }

    fun h1(text: String) {
        content += "<h1>$text</h1>"
    }
    // Función que recibe una lambda con receptor UL y retorna el HTML completo
    fun ul(init: UL.() -> Unit) {
        val ul = UL().apply(init)
        content += "<ul>${ul.content}</ul>"
    }
}
class UL {
    var content = ""

    // Función para agregar un elemento <li>
    fun li(text: String) {
        content += "<li>$text</li>"
    }
}



fun html(init: HTML.() -> Unit): HTML {
    val html = HTML() //crea el objeto receptor
    html.inicio()
    html.init()// incializamos con la lambda el objeto receptor
    html.final()
    return html
}