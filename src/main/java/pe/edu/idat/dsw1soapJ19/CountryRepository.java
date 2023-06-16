package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dia;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Dia> dia = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dia lunes = new Dia();
		lunes.setName("lunes");
		lunes.setIngles("monday");
		dia.put(lunes.getName(),lunes);

		Dia martes = new Dia();
        martes.setName("Martes");
        martes.setIngles("Tuesday");
        dia.put(martes.getName(), martes);

		Dia miercoles = new Dia();
        miercoles.setName("Miercoles");
        miercoles.setIngles("Wednesday");
		dia.put(miercoles.getName(), miercoles);

		Dia jueves = new Dia();
        jueves.setName("Jueves");
        jueves.setIngles("Thursday");
        dia.put(jueves.getName(), jueves);
		
        Dia viernes = new Dia ();
		viernes.setName("viernes");
		viernes.setIngles ("friday");
		dia.put(viernes.getName(),viernes);

        Dia sabado = new Dia ();
		sabado.setName("sabado");
		sabado.setIngles ("friday");
		dia.put(sabado.getName(),sabado);

        Dia domingo = new Dia();
		domingo.setName("domingo");
		domingo.setIngles ("sunday");
		dia.put(domingo.getName(),domingo);

		
	}

	public Dia finDia (String name) {
		Assert.notNull(name, "The day's name must not be null");
		return dia.get(name);
	}
}
