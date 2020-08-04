package com.bnb.audit;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditModel<U> {

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 29)
	@CreatedDate
	    private Date createdAt;

	   @Temporal(TemporalType.TIMESTAMP)
		@Column(name = "updated_at", nullable = false, length = 29)
		 @LastModifiedDate
	    private Date updatedAt;

	   
		

		public AuditModel(Date createdAt, Date updatedAt) {
		super();
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}



		public AuditModel() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Date getCreatedAt() {
			return createdAt;
		}



		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}



		public Date getUpdatedAt() {
			return updatedAt;
		}



		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		
	
}
