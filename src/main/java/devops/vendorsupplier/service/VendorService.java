package devops.vendorsupplier.service;

import devops.vendorsupplier.model.VendorItem;
import devops.vendorsupplier.repository.VendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    private final VendorRepository repository;

    public VendorService(VendorRepository repository) {
        this.repository = repository;
    }

    public List<VendorItem> getAllVendors() {
        return repository.findAll();
    }

    public VendorItem addVendor(VendorItem item) {
        return repository.save(item);
    }

    public VendorItem updateVendor(Long id, VendorItem item) {
        item.setId(id);
        return repository.save(item);
    }

    public void deleteVendor(Long id) {
        repository.deleteById(id);
    }
}
