package com.codegym.vn.repository.Impl;

import com.codegym.vn.model.Blog;
import com.codegym.vn.repository.IBlogRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public class BlogRepository implements IBlogRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query=em.createQuery("select c from Blog c",Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Long id) {
        TypedQuery<Blog> query=em.createQuery("select c from Blog c where c.id=:id",Blog.class);
        query.setParameter("id",id);
        try {
            return query.getSingleResult();
        }
        catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Blog newBlog) {
        if (newBlog.getId() != null){
            em.merge(newBlog);
        }
        else
            em.persist(newBlog);
    }

    @Override
    public void remove(Long id) {
        Blog blog= findById(id);
        if (blog != null)
            em.remove(blog);
    }
}
