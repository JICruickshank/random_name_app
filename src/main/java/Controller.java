import static spark.Spark.get;
import spark.Spark;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        get("/one", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            String name = randomiser.pickRandomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
            }, velocityTemplateEngine);
    }




}
