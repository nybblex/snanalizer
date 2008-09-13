package snanalizer.test;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import snanalizer.services.RedesService;

public class RedesServiceTest extends TestCase {

	private ApplicationContext context;
	private RedesService redesService;

	/**
	 * Esto se ejecuta antes de cada test
	 */
	protected void setUp() {
		context = new ClassPathXmlApplicationContext(
				"snanalizer/applicationContext.xml");
		redesService = (RedesService) context.getBean("redesService");
	}

	/**
	 * Esto se ejecuta despues de cada test
	 */
	protected void tearDown() {

	}

	public void testGetGrafo() {
		Integer idPtoVista = redesService.getRedes().get(1).getPuntosDeVista().get(1).getId();
		String grafo = redesService.getGrafo(idPtoVista);

		System.out.println(grafo);
		assertNotNull(grafo);
	}
}