import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.Collection;

@ManagedBean
@RequestScoped
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    private String name;
    private Collection<String> project=new ArrayList<>();
}
