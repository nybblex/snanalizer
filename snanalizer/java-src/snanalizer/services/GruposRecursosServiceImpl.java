package snanalizer.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import snanalizer.data.GruposRecursosRepository;
import snanalizer.data.RecursosRepository;
import snanalizer.domain.GrupoRecursos;
import snanalizer.domain.Recurso;

@Transactional
public class GruposRecursosServiceImpl implements GruposRecursosService {

	@Resource
	private GruposRecursosRepository gruposRecursosRepo;
	@Resource
	public RecursosRepository recursosRepo;

	public List<GrupoRecursos> getAll() {
		return gruposRecursosRepo.getAll();
	}

	public GrupoRecursos getById(int grupoId) {
		return gruposRecursosRepo.getById(grupoId);
	}

	public void nuevoGrupo(String descripcion, List<Integer> idsRecursos) {
		GrupoRecursos grupo = new GrupoRecursos();
		gruposRecursosRepo.add(grupo);

		grupo.setDescripcion(descripcion);
		List<Recurso> recursos = recursosRepo.getById(idsRecursos);
		grupo.setRecursos(recursos);
	}

	public void modificarGrupo(int grupoId, String descripcion,
			List<Integer> idsRecursos) {
		GrupoRecursos grupo = gruposRecursosRepo.getById(grupoId);

		grupo.setDescripcion(descripcion);
		List<Recurso> recursos = recursosRepo.getById(idsRecursos);
		grupo.setRecursos(recursos);
	}

	public void eliminar(int grupoId) {
		gruposRecursosRepo.remove(grupoId);
	}
}
