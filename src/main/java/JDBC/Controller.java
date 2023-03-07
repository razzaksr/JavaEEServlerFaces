package JDBC;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.util.Collection;
import java.util.List;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@ManagedBean
@SessionScoped
public class Controller {
    private List<Hai> data;
    private Hai hai;

    public List<Hai> getData() {
        return data;
    }

    public void setData(List<Hai> data) {
        this.data = data;
    }

    public Hai getHai() {
        return hai;
    }

    public void setHai(Hai hai) {
        this.hai = hai;
    }

    @PostConstruct
    public void show(){
        data=(List<Hai>) new DAO().all();
        hai=data.get(0);
    }
}