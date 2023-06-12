package Project1.Interfaces;

import Project1.Model.Company;
import java.util.List;

public interface ICompanyService {
    List<Company> getAllCompany();
    Company getCompanyById(Long id);
    boolean createCompany(Company company);
    boolean updateCompany(Long id, Company company);
    boolean deleteCompany(Long id);
}