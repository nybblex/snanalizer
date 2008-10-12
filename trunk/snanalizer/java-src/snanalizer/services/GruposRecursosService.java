package snanalizer.services;

import java.util.List;

import snanalizer.domain.GrupoRecursos;
import snanalizer.domain.Recurso;

public interface GruposRecursosService {

	public List<GrupoRecursos> getAll();

	public void updateGrupo(int grupoId, List<Recurso> listaRec);

	public List<Recurso> getRecursos(int grupoId);

	public void crear(GrupoRecursos grupo);

	public void nuevoGrupo(String descripcion, List<Integer> idsRecursos);
	
	public void modificarGrupo(int grupoId, String descripcion, List<Integer> idsRecursos);
}
