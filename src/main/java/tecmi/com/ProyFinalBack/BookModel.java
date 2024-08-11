package tecmi.com.ProyFinalBack;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Component
public class BookModel {
    private int id;
    private String nombre;
    private String autor;
    private String editorial;
}
