package proyecto.services;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;
import proyecto.model.Blueprint;
import proyecto.model.Point;

/**
 *
 * @author jose
 */
@Service
public class ServicesFacade {
   
    private static final Map<String,Blueprint> dummyBluePrints=new LinkedHashMap<>();
    
    static{
        
        dummyBluePrints.put(
            "larecta", 
            new Blueprint(
                "larecta",
                new Point[]{
                    new Point(50,50),
                    new Point(200,200)
                }
            )
        );
        
        dummyBluePrints.put(
            "rayon",new Blueprint(
                "rayon",new Point[]{
                    new Point(20,20),
                    new Point(300,300),
                    new Point(450,550) 
                }
            )
        );
        
        dummyBluePrints.put(            
            "poligono",                
            new Blueprint(                
                "poligono",                    
                new Point[]{
                    new Point(150,150),
                    new Point(50,200),
                    new Point(150,300),
                    new Point(200,200),
                    new Point(150,150)
                }
            )
        );    
    }
    
    public void addNewBlueprint(String name,Blueprint bp){
        dummyBluePrints.put(name,bp);
    }
    
    public Set<String> getBlueprintNames(){
        return dummyBluePrints.keySet();
    }
    
    public Blueprint getBlueprintByName(String name){
        return dummyBluePrints.get(name);
    }
    
}