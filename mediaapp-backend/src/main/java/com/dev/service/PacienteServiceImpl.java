package com.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.model.Paciente;
import com.dev.repo.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	private IPacienteRepo repo;
	
	@Override
	public Paciente registrar(Paciente p) throws Exception {
		return repo.save(p);
	}

	@Override
	public Paciente modificar(Paciente p) throws Exception {
		return repo.save(p);
	}

	@Override
	public List<Paciente> listar() throws Exception {
		return repo.findAll();
	}

	@Override
	public Paciente listarPorId(Integer id) throws Exception {
		Optional<Paciente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Paciente();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}

}
