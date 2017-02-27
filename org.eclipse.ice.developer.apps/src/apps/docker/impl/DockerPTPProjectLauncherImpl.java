/**
 */
package apps.docker.impl;

import apps.SourcePackage;

import apps.docker.ContainerConfiguration;
import apps.docker.DockerPTPProjectLauncher;
import apps.docker.DockerPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTP Project Launcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apps.docker.impl.DockerPTPProjectLauncherImpl#getContainerconfiguration <em>Containerconfiguration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerPTPProjectLauncherImpl extends MinimalEObjectImpl.Container implements DockerPTPProjectLauncher {
	/**
	 * The cached value of the '{@link #getContainerconfiguration() <em>Containerconfiguration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerconfiguration()
	 * @generated
	 * @ordered
	 */
	protected ContainerConfiguration containerconfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerPTPProjectLauncherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_PTP_PROJECT_LAUNCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerConfiguration getContainerconfiguration() {
		if (containerconfiguration != null && containerconfiguration.eIsProxy()) {
			InternalEObject oldContainerconfiguration = (InternalEObject)containerconfiguration;
			containerconfiguration = (ContainerConfiguration)eResolveProxy(oldContainerconfiguration);
			if (containerconfiguration != oldContainerconfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockerPackage.DOCKER_PTP_PROJECT_LAUNCHER__CONTAINERCONFIGURATION, oldContainerconfiguration, containerconfiguration));
			}
		}
		return containerconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerConfiguration basicGetContainerconfiguration() {
		return containerconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerconfiguration(ContainerConfiguration newContainerconfiguration) {
		ContainerConfiguration oldContainerconfiguration = containerconfiguration;
		containerconfiguration = newContainerconfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PTP_PROJECT_LAUNCHER__CONTAINERCONFIGURATION, oldContainerconfiguration, containerconfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void launchProject(SourcePackage project) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.DOCKER_PTP_PROJECT_LAUNCHER__CONTAINERCONFIGURATION:
				if (resolve) return getContainerconfiguration();
				return basicGetContainerconfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.DOCKER_PTP_PROJECT_LAUNCHER__CONTAINERCONFIGURATION:
				setContainerconfiguration((ContainerConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DockerPackage.DOCKER_PTP_PROJECT_LAUNCHER__CONTAINERCONFIGURATION:
				setContainerconfiguration((ContainerConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DockerPackage.DOCKER_PTP_PROJECT_LAUNCHER__CONTAINERCONFIGURATION:
				return containerconfiguration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DockerPackage.DOCKER_PTP_PROJECT_LAUNCHER___LAUNCH_PROJECT__SOURCEPACKAGE:
				launchProject((SourcePackage)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DockerPTPProjectLauncherImpl
