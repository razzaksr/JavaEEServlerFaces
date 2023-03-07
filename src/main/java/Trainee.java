import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {
    private String name;
    private String skillset;
}
