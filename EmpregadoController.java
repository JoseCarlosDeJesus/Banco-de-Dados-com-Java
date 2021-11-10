package br.com.prog2.rh.controller;

import java.util.List;

import br.com.prog2.rh.model.Empregado;
import br.com.prog2.rh.persistencia.EmpregadoDaoImp;

public class EmpregadoController {
	public String inserir(Empregado emp) {
		EmpregadoDaoImp dao = new EmpregadoDaoImp();
		return dao.inserir(emp);
	}

	public String alterar(Empregado emp) {
		EmpregadoDaoImp dao = new EmpregadoDaoImp();
		return dao.alterar(emp);
	}

	public String excluir(Empregado emp) {
		EmpregadoDaoImp dao = new EmpregadoDaoImp();
		return dao.excluir(emp);
	}

	public List<Empregado> listarTodos() {
		EmpregadoDaoImp dao = new EmpregadoDaoImp();
		return dao.listarTodos();
	}

	public Empregado pesquisarPorCpf(String cpf) {
		EmpregadoDaoImp dao = new EmpregadoDaoImp();
		return dao.pesquisarPorCpf(cpf);
	}

}
