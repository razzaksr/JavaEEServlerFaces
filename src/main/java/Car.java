import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@ManagedBean
@RequestScoped
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String name;
    private Collection<String> models=new ArrayList<>();
    private String selectedModel;

    @PostConstruct
    public void hai(){
        models.add("Sigma");models.add("Delta");
        models.add("Zeta");models.add("Alpha");
    }
}
