package info.somrat.services;

import info.somrat.entities.Branch;

import java.util.stream.Stream;

public interface BranchService {
    Stream<Branch> getCompanies();
}
