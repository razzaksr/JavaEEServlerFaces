package JDBC;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ManagedBean
@RequestScoped
public class Hai {
    private int id,price;
    private String name;
}
