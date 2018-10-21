package controllers;

import play.mvc.*;

import views.html.*;

import java.util.List;
import models.*;
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

    public String checklogin(String user,String pass) {
        List<Chef> chefList;
        chefList = Chef.find.all();
        String result;
        for (Chef e : chefList) {
            if (e.username.equals(user) && e.password.equals(pass)) {
                result = "Welcome!";
                break;
            } else if (e.username.equals(user)) {
                result = "Invalid Password!";
                break;
            } else if (e.password.equals(pass)) {
                result = "Invalid Username!";
                break;
            } else {
                result = "Invalid Username and Password!");
            }
        }
        return result;
    }



}










