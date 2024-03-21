package com.japanese.appliaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japanese.appliaction.model.Batches;
import com.japanese.appliaction.repository.BatchesRepo;



@Service
public class BatchesImpl implements BatchesApi{
	
	@Autowired BatchesRepo batchesRepo;

	@Override
	 public void saveBatches(Batches batches) {
        batchesRepo.save(batches);
    }

	@Override
	public List<Batches> findAll() {
		return batchesRepo.findAll();
	}

	@Override
	public boolean editBatches(Long id, Batches batches) {
		if (batchesRepo.existsById(id)) {
            batches.setId(id);
            batchesRepo.save(batches);
            return true;
        }
        return false;
	}

	@Override
	public boolean deleteBatches(Long id) {
		 if (batchesRepo.existsById(id)) {
	            batchesRepo.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	@Override
	public Batches findById(Long id) {
		return batchesRepo.findById(id).orElse(null);
	}

	

}
