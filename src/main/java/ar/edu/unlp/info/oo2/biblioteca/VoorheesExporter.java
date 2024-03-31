package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class VoorheesExporter {

	private JSONObject jsonObject;

	private JSONArray jsonArray;

	public VoorheesExporter(){
		jsonObject = new JSONObject();
		jsonArray = new JSONArray();
	}
	private JSONObject exportar(Socio socio) {
		jsonObject.put("nombre",socio.getNombre());
		jsonObject.put("email", socio.getEmail());
		jsonObject.put("legajo", socio.getLegajo());
		return 	jsonObject;
	}

	public String exportar(List<Socio> socios) {
		socios.stream().forEach( socio -> jsonArray.add(this.exportar(socio)));
		return jsonArray.toJSONString();
	}
}
