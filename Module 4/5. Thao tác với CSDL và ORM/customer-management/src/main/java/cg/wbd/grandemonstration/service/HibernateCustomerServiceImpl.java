package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.model.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class HibernateCustomerServiceImpl implements CustomerService {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findAll() {
        String querySTR = "SELECT c from Customer AS c";
        TypedQuery<Customer> query = entityManager.createQuery(querySTR, Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findOne(Long id) {
        String queryStr= "SELECT c from Customer AS c where c.id= :id";
        TypedQuery<Customer> query= entityManager.createQuery(queryStr, Customer.class);
        return query.getSingleResult();
    }

    @Override
    public Customer save(Customer customer) {
        Session session= null;
        Transaction transaction=null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            if (customer.getId() != null) {
                Customer origin = findOne(customer.getId());
                origin.setName(customer.getName());
                origin.setEmail(customer.getEmail());
                origin.setAddress(customer.getAddress());
                session.saveOrUpdate(origin);
                transaction.commit();
                return origin;
            }
            else {
                session.saveOrUpdate(customer);
                transaction.commit();
                return customer;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            if (transaction !=null) {
                transaction.rollback();
            }
        }
        finally {
            if (session !=null) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return null;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<Customer> findAll(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void delete(List<Customer> customers) {

    }

    @Override
    public void deleteAll() {

    }

}
