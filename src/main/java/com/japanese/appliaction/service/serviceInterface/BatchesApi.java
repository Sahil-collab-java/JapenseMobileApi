package com.japanese.appliaction.service.serviceInterface;

import java.util.List;

import com.japanese.appliaction.model.Batches;


public interface BatchesApi {
	
	public void saveBatches(Batches batches) ;
	
	public List<Batches> findAll();
	
	public boolean editBatches(Long id, Batches batches);
	
	public boolean deleteBatches(Long id);
	
	public Batches findById(Long id);

}
