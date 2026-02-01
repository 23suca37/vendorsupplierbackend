package devops.vendorsupplier.controller;

import devops.vendorsupplier.model.VendorItem;
import devops.vendorsupplier.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendors")
@CrossOrigin(origins = "http://localhost:3000")
public class VendorController {

    private final VendorService service;

    public VendorController(VendorService service) {
        this.service = service;
    }

    // GET all vendors
    @GetMapping
    public List<VendorItem> getAll() {
        return service.getAllVendors();
    }

    // ADD vendor
    @PostMapping
    public VendorItem add(@RequestBody VendorItem item) {
        return service.addVendor(item);
    }

    // UPDATE vendor
    @PutMapping("/{id}")
    public VendorItem update(@PathVariable Long id,
                             @RequestBody VendorItem item) {
        return service.updateVendor(id, item);
    }

    // DELETE vendor
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteVendor(id);
    }
}
