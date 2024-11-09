package vn.edu.iuh.fit.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.models.Job;
import vn.edu.iuh.fit.backend.repositories.JobRepository;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public void addJob(Job job) {
        jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public void addJobWithSkills(Job job, List<Long> skillIds) {
    }
}