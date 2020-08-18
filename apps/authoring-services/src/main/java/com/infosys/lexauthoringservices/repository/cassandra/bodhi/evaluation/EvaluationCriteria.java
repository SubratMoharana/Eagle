/*
 *                "Copyright 2020 Infosys Ltd.
 *                Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
 *                This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3"
 *
 */

package com.infosys.lexauthoringservices.repository.cassandra.bodhi.evaluation;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("evaluation_criteria")
public class EvaluationCriteria {


    @PrimaryKeyColumn(name = "root_org",type= PrimaryKeyType.PARTITIONED)
    private String rootOrg;

    @PrimaryKeyColumn(name = "org")
    private String org;

    @PrimaryKeyColumn(name = "ref_template_id")
    private String templateId;

    @PrimaryKeyColumn(name = "criteria_id")
    private String criteriaId;

    @Column("criteria")
    private String criteria;

    @Column("max_score")
    private double maxScore;

    @Column("weightage")
    private double weightage;

    @Column("min_acceptable_score")
    private double minScore;

    public EvaluationCriteria(String rootOrg, String org, String templateId, String criteriaId){
        this.rootOrg = rootOrg;
        this.org = org;
        this. templateId = templateId;
        this.criteriaId = criteriaId;
    }

    public String getRootOrg() {
        return rootOrg;
    }

    public String getOrg() {
        return org;
    }

    public String getTemplateId() {
        return templateId;
    }

    public String getCriteriaId() {
        return criteriaId;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getWeightage() {
        return weightage;
    }

    public void setWeightage(double weightage) {
        this.weightage = weightage;
    }

    public double getMinScore() {
        return minScore;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }
}