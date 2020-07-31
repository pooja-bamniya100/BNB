package com.bnb.model;
// Generated 30 Jul, 2020 3:44:28 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * SchemaMigrations generated by hbm2java
 */
@Entity
@Table(name = "schema_migrations", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "version"))
public class SchemaMigrations implements java.io.Serializable {

	private String version;

	public SchemaMigrations() {
	}

	public SchemaMigrations(String version) {
		this.version = version;
	}

	@Id

	@Column(name = "version", unique = true, nullable = false)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
