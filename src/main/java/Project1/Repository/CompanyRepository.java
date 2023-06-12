package Project1.Repository;


import Project1.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}