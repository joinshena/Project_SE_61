package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.sreach.render());
    }


    public Result create() {
        return ok(views.html.Create.render());
    }

    public Result edit(){
        return ok(views.html.Edit.render());
    }
    public Result present() {return ok(views.html.Present.render());}
<<<<<<< HEAD
    public Result gg() {return ok(views.html.gg.render());}


=======
    public Result showmenucos() {return ok(views.html.showmenucos.render());}
    public Result showmenuadmin() {return ok(views.html.showmenuadmin.render());}
>>>>>>> 3f31614c8e66fc9ba12c4565786b8c2db69c605a
}