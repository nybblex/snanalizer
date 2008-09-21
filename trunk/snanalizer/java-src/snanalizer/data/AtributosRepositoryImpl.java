package snanalizer.data;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import snanalizer.domain.Atributo;
import snanalizer.domain.DatoMaestro;


public class AtributosRepositoryImpl extends BaseRepositoryImpl<Atributo> implements
		AtributosRepository {


	public Atributo getAtributo() {
		return null;
	
	}
	
	public List<Atributo> getAtributos(DatoMaestro dm) {
		Criteria criteria = createCriteria();
		criteria.add(Restrictions.eq("datoMaestro", dm));

		return find(criteria);
	}
	
	
}