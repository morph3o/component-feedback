import de.unimannheim.app._
import org.scalatra._
import javax.servlet.ServletContext

import de.unimannheim.controllers.Endpoints

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new Endpoints, "/*")
  }
}
