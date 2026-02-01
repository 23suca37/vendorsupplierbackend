package devops.vendorsupplier.repository;

import devops.vendorsupplier.model.VendorItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<VendorItem, Long> {
}
