package com.db1start.cidadesapi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.repository.EstadoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstadoServiceTest {

	@Autowired
	private EstadoService estadoService;

	@Test
	public void test() {
		Estado estado = estadoService.criar("Paraná");

		assertNotNull(estado);
		System.out.println(estado.getId());
	}
}
