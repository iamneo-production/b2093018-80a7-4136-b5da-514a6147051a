package com.examly.springapp.UserModel;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class DocumentModel {

              @Id
              int documentId;
              String documenttype;
              @Lob
              byte[] documentupload;
              
               @OneToOne
              @JoinColumn(name="policy_id")
              private PolicyModel policy;

			public int getDocumentId() {
				return documentId;
			}

			public void setDocumentId(int documentId) {
				this.documentId = documentId;
			}

			public String getDocumenttype() {
				return documenttype;
			}

			public void setDocumenttype(String documenttype) {
				this.documenttype = documenttype;
			}

			public byte[] getDocumentupload() {
				return documentupload;
			}

			public void setDocumentupload(byte[] documentupload) {
				this.documentupload = documentupload;
			}

			public PolicyModel getPolicy() {
				return policy;
			}

			public void setPolicy(PolicyModel policy) {
				this.policy = policy;
			}

			public DocumentModel(int documentId, String documenttype, byte[] documentupload, PolicyModel policy) {
				super();
				this.documentId = documentId;
				this.documenttype = documenttype;
				this.documentupload = documentupload;
				this.policy = policy;
			}

			@Override
			public String toString() {
				return "DocumentModel [documentId=" + documentId + ", documenttype=" + documenttype
						+ ", documentupload=" + Arrays.toString(documentupload) + ", policy=" + policy + "]";
			}

			public DocumentModel() {
				super();
				// TODO Auto-generated constructor stub
			}
               
}
